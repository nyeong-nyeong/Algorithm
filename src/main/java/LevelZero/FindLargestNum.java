package LevelZero;

public class FindLargestNum {

    // 가장 큰 수 찾기
    // 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    public int[] solution(int[] array) {
        int aa = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {

            if(n < array[i]) {
                aa = i;
                n = array[i];
            }
        }
        return new int[] {n , aa} ;

//        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList()); array -> List
//        int max = list.stream().max(Integer::compareTo).orElse(0); stream().max() -> 가장 큰 값 저장
//        int index = list.indexOf(max); -> list.indexOf 로 인덱스 값 확인
//        return new int[] {max, index};

    }

}
