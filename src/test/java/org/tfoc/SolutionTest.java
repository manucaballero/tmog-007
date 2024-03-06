package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class SolutionTest {

    @Test
    void anagramSolution01(){

        boolean result = Solution.isAnagram("anagram","nagaram");

        assertTrue(result);
    }

    @Test
    void anagramSolution02(){

        boolean result = Solution.isAnagram("rat","art");

        assertTrue(result);
    }

    @Test
    void notAnagramSolution01(){

        boolean result = Solution.isAnagram("rat","car");

        assertFalse(result);
    }

}