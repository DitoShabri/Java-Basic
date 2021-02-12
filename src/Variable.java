public class Variable {
    public static void main(String[] args) {

        /*
        Ini adalah cara kita mendeklarasikan Tipe data dengan tidak menggunakan
        "Var" kita masih bisa menggunakan Default (Mengkosongkan tipe data lalu kita
        isi dibawah nya
         */

        String name;
        name = "DitoSabri";

        int age = 22;
        String address;
        address = "TangerangKota";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "FirliShabri";
        System.out.println(name);

     /*
     Lihat lah perbedaan nya jika kita menggunakan Var
      */

        var firstName = "Dito";
        var lastName = "Shabri";

        System.out.println(firstName);
        System.out.println(lastName);

        /*
        ada sebuah variable yang tidak bisa dirubah, atau konstanta,
        lET ME SHOW YOU!!!
         */
        final String fatherName = "Ahmad"  ;

        System.out.println(fatherName);
    }
}
