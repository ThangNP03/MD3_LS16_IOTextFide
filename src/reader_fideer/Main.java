package reader_fideer;

import java.io.*;

public class Main {
    public static void copyFile(String sourceFile, String targetFile) throws IOException {
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Tệp nguồn không tồn tại!");
            return;
        }
        File target = new File(targetFile);


        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(target)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }

        long fileSize = target.length();
        System.out.println("Đã sao chép tệp " + sourceFile + " vào " + targetFile + " với " + fileSize + " byte.");
    }

    public static void main(String[] args) throws IOException {
        copyFile("D:\\MD3\\HKThong_ListBook\\MD3_LS16_BaiTap_IOFideText\\src\\reader_fideer\\soure.txt",
                "D:\\MD3\\HKThong_ListBook\\MD3_LS16_BaiTap_IOFideText\\src\\reader_fideer\\target.txt");

    }
}