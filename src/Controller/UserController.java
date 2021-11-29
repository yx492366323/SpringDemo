package Controller;

import Domain.Person;
import Domain.User;
import Domain.UserList;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser() {
        this.userService.saveUser();
        System.out.println("UserController.saveUser()");
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addUser(User user) throws Exception {
        System.out.println("Username:" + user.getUsername());
        System.out.println("Passwd:" + user.getPasswd());
        return "<h1>Ok</h1>\n<a href=\"./\">Return Home</a>";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String queryPerso(Person person) throws Exception {
        System.out.println("Name:" + person.getName());
        System.out.println("Code:" + person.getIdcard().getCode());
        return "<h1>Ok</h1>\n<a href=\"./\">Return Home</a>";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteUsers(@RequestParam(value = "ids") Integer[] ids) throws Exception {
        if (ids != null) {
            for (Integer id : ids) {
                System.out.println("删除了id 为" + id + "的用户!");
            }
        } else {
            System.out.println("ids=null");
        }
        return "<h1>Ok</h1>\n<a href=\"./\">Return Home</a>";
    }

    @RequestMapping("/editUsers")
    @ResponseBody
    public String editUsers(UserList userList) {
        List<User> users = userList.getUsers();
        for (User user : users) {
            if (user.getUsername() != null) {
                System.out.println("修改了密码为" + user.getPasswd() + "的用户名为:" + user.getUsername());
            }
        }
        return "<h1>Ok</h1>\n<a href=\"./\">Return Home</a>";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "msg",required = false) String msg) {
        ModelAndView mav = new ModelAndView("login.jsp");
        mav.addObject("msg", msg);
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session) {
        //获取用户名和密码
        String username = user.getUsername();
        Integer password = user.getPasswd();
        System.out.println(username);
        //此处模拟从数据库中获取用户名和密码后进行判断
        if (username != null && username.equals("admin") && password != null && password == 123456) {
            session.setAttribute("USER_SESSION", user);
            //重定向到主页面的跳转方法
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录!");
        return "redirect:login";
    }

    @RequestMapping(value = "/main")
    public ModelAndView toMain() {
        ModelAndView mav = new ModelAndView("jsp/main.jsp");
        return mav;
    }

    /*
     *退出登录
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        //消除Session
        session.invalidate();
        //重定向到登录页面的跳转方法
        return "redirect:login";
    }
}

