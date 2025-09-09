import java.util.*;

public class GridlandMetro {

    static class Track {
        int start, end;
        Track(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static long gridlandMetro(int n, int m, int k, int[][] tracks) {
        
        Map<Integer, List<Track>> rowTracks = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int r = tracks[i][0];
            int c1 = tracks[i][1];
            int c2 = tracks[i][2];

            rowTracks.putIfAbsent(r, new ArrayList<>());
            rowTracks.get(r).add(new Track(c1, c2));
        }

        long occupied = 0;

        
        for (List<Track> trackList : rowTracks.values()) {
            // Sort intervals by start column
            trackList.sort((a, b) -> Integer.compare(a.start, b.start));

            int mergedStart = trackList.get(0).start;
            int mergedEnd = trackList.get(0).end;

            for (int i = 1; i < trackList.size(); i++) {
                Track t = trackList.get(i);
                if (t.start <= mergedEnd) {
                   
                    mergedEnd = Math.max(mergedEnd, t.end);
                } else {
                   
                    occupied += (mergedEnd - mergedStart + 1);
                    mergedStart = t.start;
                    mergedEnd = t.end;
                }
            }
            
            occupied += (mergedEnd - mergedStart + 1);
        }

        long totalCells = (long) n * m;
        return totalCells - occupied;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] tracks = new int[k][3];
        for (int i = 0; i < k; i++) {
            tracks[i][0] = sc.nextInt();
            tracks[i][1] = sc.nextInt();
            tracks[i][2] = sc.nextInt();
        }

        System.out.println(gridlandMetro(n, m, k, tracks));
        sc.close();
    }
}
