package builder.examples.recursiveGenerics;

// builder inheritance with recursive generics

import builder.examples.recursiveGenerics.builder.EmployeeBuilder;

class RecursiveGenericsDemo
{
    public static void main(String[] args)
    {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Dmitri")
                .worksAs("Quantitative Analyst");
        System.out.println(eb.build());
    }
}
