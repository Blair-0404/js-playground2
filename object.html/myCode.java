import java.io.BufferedReader;
import java.io.InputStreamReader;er; // don't place package name! */
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;eredReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] inputArr = new String[n];

		for (int i = 0; i < n; i++) {
			inputArr[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			String[] split = inputArr[i].split(" ");
			String collect = Arrays.stream(split).map(it -> new StringBuffer(it).reverse()).collect(Collectors.joining(" "));
			System.out.println(collect);
		}
    }
}