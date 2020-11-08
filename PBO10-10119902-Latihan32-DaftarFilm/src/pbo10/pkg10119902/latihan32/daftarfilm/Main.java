/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Daftar Film
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Daftar Film Sedang Tayang ===");
        Film film1 = new Film();
        film1.filmName="Venom";
        film1.filmGenre="Action, Horror, Scifi";
        film1.filmRating=8.5;
        film1.filmDuration=120;
        film1.nowPlaying();
        
        Film film2 = new Film();
        film2.filmName="small Foot";
        film2.filmGenre="Animation";
        film2.filmRating=9.0;
        film2.filmDuration=96;
        film2.nowPlaying();
        
        Film film3 = new Film();
        film3.filmName="Crazy Rich Asian";
        film3.filmGenre="Comedy";
        film3.filmRating=7.8;
        film3.filmDuration=119;
        film3.nowPlaying();
        
        Film film4 = new Film();
        film4.filmName="Asih";
        film4.filmGenre="Horror";
        film4.filmRating=6.0;
        film4.filmDuration=100;
        film4.nowPlaying();
    }
    
}
