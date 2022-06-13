package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // Dependency Injection 의존성주입!
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
