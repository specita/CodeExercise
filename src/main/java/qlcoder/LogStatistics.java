package qlcoder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by p.chen on 2016/4/22.
 */
public class LogStatistics {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D://uv.txt");
        Stream<String> lines = Files.lines(path);

        Pattern pattern =Pattern.compile("2015-08-24");
        Matcher matcher = pattern.matcher("2015-08-24_15:08:20 31259 buy");
        System.out.println(matcher.find());

        long count = lines.filter(s -> pattern.matcher(s).find()).map(s -> s.substring(s.indexOf(" "), s.lastIndexOf(" "))).distinct().count();
        System.out.println(count);
    }
}
