
class Account {
  private final long accountnr;
  private final String name;
  private double saldo;

  public Account(long accountnr, String name, double saldo) {
    this.accountnr = accountnr;
    this.name = name;
    this.saldo = saldo;
  }

  public Account(long accountnr, String name) {
    this.accountnr = accountnr;
    this.name = name;
    this.saldo = 0;
  }

  public long getAccountnr() {
    return accountnr;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getName() {
    return name;
  }

  public void doTransaktion(double amount) {
    saldo = saldo + amount;
  }

  public String toString(){
	  return accountnr + " " + name + " " + saldo;
  }

}
