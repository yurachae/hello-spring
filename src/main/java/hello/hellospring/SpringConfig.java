package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    //직접 스프링 빈 등록

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }

//    @Bean
//    public MemberRepository memberRepository() {
    //  OCP (Open-Closed Princlple) 개방 폐쇄 원칙
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(datasource);
//        return new JdbcTemplateMemberRepository(datasource);
//        return new JpaMemberRepository(em);
//    }
}
