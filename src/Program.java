import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "D:\\Projects\\Exercício trabalhando com files\\list.txt";
		String outputPath = "D:\\Projects\\Exercício trabalhando com files\\summary.csv";
		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = "";

			while ((line = br.readLine()) != null) {

				String[] product = line.split(",");
				String name = product[0];
				double price = Double.parseDouble(product[1]);
				int quantity = Integer.parseInt(product[2]);

				list.add(new Product(name, price, quantity));
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {

			for (Product item : list) {
				bw.write(item.getName() + " Sub Total : " + String.format("%.2f", item.total()));
				bw.newLine();
			}
		}

		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
	}

}
