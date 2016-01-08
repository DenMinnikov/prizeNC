import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class DBClass {
    public static String URL = "jdbc:postgresql://127.0.0.1/prize";
    public static String NAME = "den";
    public static String PASSWORD = "den";
    private static String query;
    private static Formatter connection;

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        List<Prize> prize = prizeSearch(25);
        for (Prize s: prize) {
            System.out.println(s);
        }

        /**
         * loop into collection to print each prize
         */
    }

    /**
     * Return List of Prizes
     *
     * @param prizeAge
     * @throws SQLException
     */
    public static List<Prize> prizeSearch(int prizeAge) throws SQLException {
        List<Prize> list = new ArrayList<Prize>();
        Statement statement = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Драйвер подключен");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("Соединение установлено");

            statement = connection.createStatement();
            DBClass.query = "select prize_name, prize_age from prize_tab where prize_age < " + prizeAge;
            ResultSet result = statement.executeQuery(DBClass.query);

            while (result.next()) {
                String prizeName = result.getString("prize_name");
                prizeAge = result.getInt("prize_age");
                Prize prize = new Prize();
                prize.setPrizeAge(prizeAge);
                prize.setPrizeName(prizeName);
                list.add(prize);
            }

            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } return list;
    }
}

