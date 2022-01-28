/** To transfer, then compile and run remotely:
 * scp WhereAmI.java cs15lwi22afr@ieng6.ucsd.edu:~/;
 * ssh cs15lwi22afr@ieng6.ucsd.edu 'javac WhereAmI.java; java WhereAmI' 
 * (One line)  
*/ 
class WhereAmI {
    public static void main(String[] args) {
      System.out.println(System.getProperty("os.name"));
      System.out.println(System.getProperty("user.name"));
      System.out.println(System.getProperty("user.home"));
      System.out.println(System.getProperty("user.dir"));
    }
  }