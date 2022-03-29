
public class Elephant extends Animal {
        public Elephant(String type){
            super(type);
        }

        @Override
        public void height() {
            System.out.println("the height of elephant is 3M");
        }

        @Override
        public void weight() {
            System.out.println("The weight of elephant is 1000Kg");            
        }        
}