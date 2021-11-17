public class Driver {
    public static void main(String[] args) {
        //testing out arguments
        Stack<String> s1 = new Stack<String>();
        s1.push("1st Node");
        s1.push("2nd Node");
        s1.push("3rd Node");

//        for (int i = 0; i < 3; i++) {
//            System.out.println(s1.size());
//            System.out.println(s1.pop());
//        } for push method


        System.out.println("Must print 3");
        System.out.println(s1.size());

        System.out.println("Must print out the 3rd Node");
        System.out.println(s1.pop());

        System.out.println("Must print out 2nd Node");
        System.out.println(s1.peek());

        System.out.println("Should print false");
        System.out.println(s1.isEmpty());
        }
    }
