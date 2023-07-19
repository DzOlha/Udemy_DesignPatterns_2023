package builder.codeBuilderTask;

import builder.codeBuilderTask.builder.CodeBuilder;

class Demo {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb);
    }
}
