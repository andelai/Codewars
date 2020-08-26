package Kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD by writing your own tests

public class SolutionTestFilenameGenerator {
    @Test
    public void test() {
        PhotoManager photoManager = new PhotoManager();
        for (int i = 0; i < 10; i++) {
            String name = FilenameGenerator.generateName(photoManager);
            assertTrue(photoManager.nameWasUnique(name));
            assertEquals(6, name.length());
        }
    }
}