    package LatihanPraktikum;

    public class PencarianBukuPraktikum {
        BukuPraktikum listBk[] = new BukuPraktikum[5];
        int idx;
        boolean isGanda = false;

        void tambah(BukuPraktikum m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            for (BukuPraktikum m : listBk) {
                m.tampilDataBuku();
            }
        }

        public int FindSeqSearch(int cari) {
            int posisi = -1;
            for (int i = 0; i < listBk.length; i++) {
                if (Integer.parseInt(listBk[i].kodeBuku)  == cari) {
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

        public  BukuPraktikum FindBukuSequential(int cari) {
            int posisi = -1;
            for (int i = 0; i < listBk.length; i++) {
                if (Integer.parseInt(listBk[i].kodeBuku) == cari) {
                    posisi = i;
                    break;
                } 
            }
            return listBk[posisi];
        }

        public void SortingBF() {
            for (int i = 0; i < listBk.length - 1; i++) {
                for (int j = i + 1; j < listBk.length; j++) {
                    if (Integer.parseInt(listBk[i].kodeBuku) > Integer.parseInt(listBk[j].kodeBuku)) {
                        BukuPraktikum temp = listBk[i];
                        listBk[i] = listBk[j];
                        listBk[j] = temp;
                    }
                }
            }
        }

        public BukuPraktikum FindJudulBukuSeq(String cari) {
            int posisi = -1;
            int cekGanda = 0;
            for (int i = 0; i < listBk.length; i++) {
                if (listBk[i].judulBuku.equals(cari)) {
                    posisi = i;
                    cekGanda++;
                } 
            }
            if (cekGanda > 1) {
                isGanda = true;
            }
            if (posisi != -1) {
                return listBk[posisi];
            } else {
                return null;
            }
        }

        public BukuPraktikum FindJudulBukuBinary(String cari) {
            int posisi = -1;
            int left = 0;
            int right = listBk.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (listBk[mid].judulBuku.equals(cari)) {
                    posisi = mid;
                    break;
                } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (posisi != -1) {
                return listBk[posisi];
            } else {
                return null;
            }
        }

        public int FindBinarySearch(int cari, int left, int right) {
            int mid;
            if (right >= left) {
                mid = (left + right) / 2;
                if (Integer.parseInt(listBk[mid].kodeBuku) == cari) {
                    return mid;
                } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) {
                    return FindBinarySearch(cari, left, mid - 1);
                } else {
                    return FindBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }


    }
