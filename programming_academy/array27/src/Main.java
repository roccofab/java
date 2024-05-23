// verificare se un dato array contiene un sottoarray con somma 0
public class Main {
    public static boolean VerificaSomma(int[] array) {
        for(int i = 0; i < array.length -1; i++){
            for(int j = i; j < array.length; j++) {
                if(array[i] + array[j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void StampaArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, -2, 3, 4, 5, 6};
        StampaArray(nums1);
        boolean b1 = VerificaSomma(nums1);
        System.out.println(b1);
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        StampaArray(nums2);
        boolean b2 =VerificaSomma(nums2);
        System.out.println(b2);
        int[] nums3 = {1, 2, -3, 4, 5, 6};
        StampaArray(nums3);
        boolean b3 = VerificaSomma(nums3);
        System.out.println(b3);
    }
    }