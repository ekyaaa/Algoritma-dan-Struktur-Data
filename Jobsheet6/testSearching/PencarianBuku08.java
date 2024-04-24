    package testSearching;

    public class PencarianBuku08 {
        Buku listBk[] = new Buku[5];
        int idx;

        void tambah(Buku m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            for (Buku m : listBk) {
                m.tampilDataBuku();
            }
        }

        public int FindSeqSearch(int cari) {
            int posisi = -1;
            for (int i = 0; i < listBk.length; i++) {
                if (listBk[i].kodeBuku == cari) {
                    posisi = i;
                    break;
                }
            }
            return posisi;
        }

        public void TampilPosisi (int x, int pos) {
            if (pos != -1) {
                System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
            } else {
                System.out.println("Data "+ x + " tidak ditemukan");
            }
        }

        public void TampilData (int x, int pos) {
            if (pos != -1) {
                System.out.println("Kode Buku\t : " + x);
                System.out.println("Judul Buku\t : " + listBk[pos].judulBuku);
                System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
                System.out.println("Pengarang\t : " + listBk[pos].pengarang);
                System.out.println("Stock\t : " + listBk[pos].stock);
            } else {
                System.out.println("data " + x + " tidak ditemukan");
            }
        }

        public  Buku FindBuku(int cari) {
            int posisi = -1;
            for (int i = 0; i < listBk.length; i++) {
                if (listBk[i].kodeBuku == cari) {
                    posisi = i;
                    break;
                } 
            }
            return listBk[posisi];
        }

        public int FindBinarySearch(int cari, int left, int right) {
            int mid;
            if (right >= left) {
                mid = (left + right) / 2;
                if (listBk[mid].kodeBuku == cari) {
                    return mid;
                } else if (listBk[mid].kodeBuku > cari) {
                    return FindBinarySearch(cari, left, mid - 1);
                } else {
                    return FindBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }
    }
