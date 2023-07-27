package O;

public class UserDBStatistics extends UsersDB{
  private int inserts;
  private int eliminations;

  @Override
  public void insert(User user) {
    super.insert(user);
    inserts++;
  }

  @Override
  public void delete(User user) {
    super.delete(user);
    eliminations++;
  }

  public int getInserts() {
    return inserts;
  }

  public int getEliminations() {
    return eliminations;
  }
}
