package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.odrer.OrderService;
import hello.core.odrer.OrderServiceImpl;

//공연 기획자.
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());//생성자 주입
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());//생성자 주입
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
