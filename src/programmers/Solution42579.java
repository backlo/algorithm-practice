package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Solution42579 {

    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Music>> musics = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            List<Music> getMusic = valueOf(musics, genres[i]);
            getMusic.add(new Music(i, plays[i]));
            Collections.sort(getMusic);
            musics.put(genres[i], getMusic);
        }

        List<List<Music>> orderMusics = musics.entrySet()
                .stream()
                .sorted((t1, t2) -> getTotalPlays(t2.getValue()) - getTotalPlays(t1.getValue()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        List<Integer> answers = new ArrayList<>();

        for (List<Music> orderMusic : orderMusics) {
            answers.add(orderMusic.get(0).getId());
            if (orderMusic.size() > 1) {
                answers.add(orderMusic.get(1).getId());
            }
        }

        return answers.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    private List<Music> valueOf(Map<String, List<Music>> musics, String genre) {
        return musics.containsKey(genre) ? musics.get(genre) : new ArrayList<>();
    }

    private int getTotalPlays(List<Music> musics) {
        return musics.stream()
                .mapToInt(music -> music.plays)
                .sum();
    }

    static class Music implements Comparable<Music> {
        private final int id;
        private final int plays;

        public Music(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }

        @Override
        public int compareTo(Music o) {
            if (this.plays == o.plays) return this.id - o.id;
            return o.plays - this.plays;
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        Solution42579 solution = new Solution42579();
        String[] generes = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution.solution(generes, plays)));
    }
}
