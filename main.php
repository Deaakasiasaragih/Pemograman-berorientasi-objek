<?php
function luas_persegi($sisi) {
    return $sisi * $sisi;
}

$sisi_persegi = floatval(readline("Masukkan panjang sisi persegi: "));
echo "Luas persegi adalah: " . luas_persegi($sisi_persegi) . "\n";

function luas_persegi_panjang($panjang, $lebar) {
    return $panjang * $lebar;
}

$panjang_persegi_panjang = floatval(readline("Masukkan panjang persegi panjang: "));
$lebar_persegi_panjang = floatval(readline("Masukkan lebar persegi panjang: "));
echo "Luas persegi panjang adalah: " . luas_persegi_panjang($panjang_persegi_panjang, $lebar_persegi_panjang) . "\n";

function luas_lingkaran($jari_jari) {
    return pi() * $jari_jari ** 2;
}

$jari_jari_lingkaran = floatval(readline("Masukkan jari-jari lingkaran: "));
echo "Luas lingkaran adalah: " . luas_lingkaran($jari_jari_lingkaran) . "\n";

function luas_segitiga($alas, $tinggi) {
    return 0.5 * $alas * $tinggi;
}

$alas_segitiga = floatval(readline("Masukkan alas segitiga: "));
$tinggi_segitiga = floatval(readline("Masukkan tinggi segitiga: "));
echo "Luas segitiga adalah: " . luas_segitiga($alas_segitiga, $tinggi_segitiga) . "\n";
?>
