package SpringFramework;

public class codeExamples {
    public static void helloWorld() {
        System.out.println("============ Hello World in Spring ============");
        System.out.println("Step 1: Create a spring boot project and make sure to include the \"Spring Web\" dependency to enable Spring MVC");
        System.out.println("Step 2: create a controller class that returns a hello world message\n");
        System.out.println("import org.springframework.web.bind.annotation.GetMapping;\n" +
                           "import org.springframework.web.bind.annotation.RestController;\n\n" +
                           "@RestController\n" +
                           "public class HelloController {\n\n" +
                           "    @GetMapping(\"/hello\")\n" +
                           "    public String sayHello() {\n" +
                           "        return \"Hello, World!\";\n" +
                           "    }\n" +
                           "}\n");
        System.out.println("Step 3: Create application class to run the program\n");
        System.out.println("import org.springframework.boot.SpringApplication;\n" +
                           "import org.springframework.boot.autoconfigure.SpringBootApplication;\n\n" +
                           "@SpringBootApplication\n" +
                           "public class HelloWorldApplication {\n\n" +
                           "\tpublic static void main(String[] args) {\n" +
                           "\tSpringApplication.run(HelloWorldApplication.class, args);\n" +
                           "\t}\n" +
                           "}\n");
        System.out.println("Step 4: Open a browser and go to http://localhost:8080/hello");

    }
}
