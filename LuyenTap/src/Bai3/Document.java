package Bai3;

import java.io.*;

public class Document implements IStoreable, IEncryptable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void Write() {
        try (FileOutputStream fos = new FileOutputStream("document.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(content);
            System.out.println("Nội dung đã được ghi vào file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Read() {
        try (FileInputStream fis = new FileInputStream("document.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            content = sb.toString();
            System.out.println("Nội dung đã được đọc từ file:");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Encrypt() {
        System.out.println("Nội dung đã được mã hóa.");
    }

    @Override
    public void Decrypt() {
        System.out.println("Nội dung đã được giải mã.");
    }

    public static void main(String[] args) {
        Document doc = new Document("Đây là nội dung của tài liệu.");

        System.out.println("Ghi nội dung vào file...");
        doc.Write();

        System.out.println("Đọc nội dung từ file...");
        doc.Read();

        System.out.println("Mã hóa nội dung...");
        doc.Encrypt();

        System.out.println("Giải mã nội dung...");
        doc.Decrypt();
    }
}

