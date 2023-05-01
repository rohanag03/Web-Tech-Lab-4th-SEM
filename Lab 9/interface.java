// Define the interface
interface Number {
    int process(int x, int y);
  }
  
  // Implement the Sum class
  class Sum implements Number {
    public int process(int x, int y) {
      return x + y;
    }
  }
  
  // Implement the Average class
  class Average implements Number {
    public int process(int x, int y) {
      return (x + y) / 2;
    }
  }
  
  // Demonstrate runtime polymorphism
  class Demo {
    public static void main(String[] args) {
      Number n;
  
      // Create a Sum object and call its process method
      n = new Sum();
      System.out.println("Sum: " + n.process(10, 20));
  
      // Create an Average object and call its process method
      n = new Average();
      System.out.println("Average: " + n.process(10, 20));
    }
  }