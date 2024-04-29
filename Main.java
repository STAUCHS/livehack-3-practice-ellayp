class Main extends ConsoleProgram {
  public void run() {
      System.out.println(doubleChar ("The "));
  }


  /**
   * 
   * @param str
   * @return 
   */
  public String doubleChar(String str) {
    String result = "";
    char c;

    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);

      result += Character.toString(c) + Character.toString(c);
    }

    return result;
  }
}