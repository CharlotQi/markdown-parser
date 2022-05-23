import static org.junit.Assert.*;
import java.util.List;

import org.junit.*;
// import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {

    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    // @Test
    // public void getLinks() throws IOException {
    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
	//     System.out.println(links);
    //     assertEquals(List.of("https://something.com", "some-thing.html"), links);
    // }
    
    // @Test
    // public void getLinks2() throws IOException {
    //     Path fileName = Path.of("test-file5.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
	//     System.out.println(links);
    //     assertEquals(List.of(), links);
    // }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("`google.com"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testSnippet2() throws IOException {
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("a.com","a.com(())","example.com"), 
        MarkdownParse.getLinks(content));
    }

    @Test
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://www.twitter.com",
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
        "https://cse.ucsd.edu/"), MarkdownParse.getLinks(content));
    }
}
