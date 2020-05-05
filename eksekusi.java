
public class eksekusi {
    public static void main (String[] args) {
        entahhh objek = new entahhh();
        objek.setNidn("0906078701");
        objek.setName("Mardiyah Hasnawi,S.Kom.,M.Cs");
        objek.setJurusan("teknik informatika");
        objek.setFakultas("ilmu komputer");
        objek.setEmail("mardiyyah.hm@gmail.com");
        
        String nidn = objek.getNidn();
        String name = objek.getName();
        String jurusan = objek.getJurusan();
        String fakultas = objek.getFakultas();
        String email = objek.getEmail();
        
        System.out.println("nidn :" +nidn +"\n  nama :" +name +"\n  jurusan:" +jurusan
        +"\n  fakultas :" +fakultas + "\n  email :" +email);
        
    }
}
