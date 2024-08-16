package lms;

public class DecoratorPattern {
    // Decorator pattern is used to add responsiblity on object dynammically
    // to add Features like fine Calculation,notification or premium member benefits
    //Decorated object change behaviour at run time, at same time other instance is not get affected
    // by this, so individual objects get the modified behaiour
}

abstract class MemberDecorator extends Member{
    protected Member member;
    public MemberDecorator(Member member) {
        super(member.getName());
        this.member = member;
    }
}
class PremiumMember extends MemberDecorator{

    public PremiumMember(Member member) {
        super(member);
    }
    public void accessPremiumContent() {
        System.out.println(member.getName() + " can access premium content.");
    }
}