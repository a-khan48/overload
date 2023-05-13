import java.util.Scanner;
    public class Counter {
        public int startValue;
        public Counter(){};
        public Counter(int startValue){
            this.startValue = startValue;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Add starter value: ");
            String input = scanner.nextLine();
            Counter counter = !input.equals("") ? new Counter(Integer.parseInt(input)) : new Counter();
            System.out.println("Input any number, after, add any number to change.");
            while(true) {
                    System.out.println("1 for increase, 2 for decrease (0 to exit)");
                int choice = Integer.parseInt(scanner.nextLine());
                String number = scanner.nextLine();

                if(choice == 0) {
                    System.out.println("Final Value : " + counter.value());
                    break;
                } else if(choice == 1) {
                    if(number.equals("")) {
                        counter.increase();
                    } else {
                        counter.increase(Integer.parseInt(number));
                    }
                } else if(choice == 2) {
                    if(number.equals("")) {
                        counter.decrease();
                    } else {
                        counter.decrease(Integer.parseInt(number));
                    }
                }
                System.out.println("New value : " + counter.value());
            }
        }


        public int value() {
            return startValue;
        }

        public void increase() {
          startValue = startValue + 1;
        }


        public void increase(int increaseBy) {
            if(increaseBy > 0) startValue += increaseBy;
        }

        public void decrease() {
            startValue--;
        }

        public void decrease(int decreaseBy) {
            if(decreaseBy > 0) startValue -= decreaseBy;
        }
    }

