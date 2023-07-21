package creational.builder.examples.facade;


import creational.builder.examples.facade.builder.PersonBuilder;
import creational.builder.examples.facade.model.Person;

public class BuilderFacadeDemo
{
    public static void main(String[] args)
    {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                    .at("123 London Road")
                    .in("London")
                    .withPostcode("SW12BC")
                .works()
                    .at("Fabrikam")
                    .asA("Engineer")
                    .earning(123000)
                .build();
        System.out.println(person);
    }
}
