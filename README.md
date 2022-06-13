# Personel takip Sistemi

## Proje nasıl çalışıyor

- Personel takip sistemi için daha çok Yöneticinin hakim olduğu bir sistem yapmaya çalıştım.
- Uygulamada Yönetici ekleme, güncelleme, silme, arama özellikleriyle rahat bir şekilde
personele işlemlerini takip edebiliyor. Bunun yanı sıra özel arama ve filtreleme özellikleri
sayesinde işlemleri daha rahat bir şekilde yapabiliyor.
- Giriş ekranındaki personel kayıt sistemi sayesinde de Herhangi bir personel genel bilgilerini girerek yöneticiye kaydını gönderebiliyor. Bu sayede işlemler daha kısa sürede yapılabiliyor. Grafik ekranı ile de anlık olarak personel verilerini görsel olarak görebiliyor.
- Ek olarak özelleştirme seçenekleriyle de kullanıcının isteğine göre tema ve dil seçilebiliyor. Bir hata olduğunda da bunu ayarlardan kaydedip dosya olarak kayıt edebiliyor.

## Projedeki Özelikler:

### 1. Özelleştirilmiş UI Elelemanları

![resim](https://user-images.githubusercontent.com/75750279/173315785-4c8599db-4e81-464b-94c8-436dea1e2724.png)

**Buton**: Swingin kendi butonları daha modern bir arayüzekavuşturmak için en baştan biraz daha yuvarlatılmış ve düz olaraktasarlandı. Basıldığında, üzerine gelindiğinde fakrlı renkler gösterme özelliği eklendi ve bunların set ve get metodları oluşturularak Netbeans’in properties ekranından da ayarlanabilir hale getirildi.

![resim](https://user-images.githubusercontent.com/75750279/173315814-2c9ac07c-a78d-4c72-a40c-89fb20e98549.png)
**TextField**: İpucu özelliği ile daha moderne bir görünüm eklenerek
oluşturuldu. 

**ImageViewer**: Swinde image viewer oladığı için ve label ile de boyut sıkıntıları
olduğu için label’den kalıtım alınarak otomatik boyutlanabilen ve kaynak dosyasına koyduğumuz resimlerin sadece isimlerini propertiese eklediğim image bölümenden ayarlayabiliyoruz.

![resim](https://user-images.githubusercontent.com/75750279/173315859-11b4ffd4-e291-4906-aac1-682b6e519736.png)
**SvgImage**: Swinde svg label’le de desteklenmediği için internetten bir svg kütüphanesini kalıtım alarak özel svg görüntüleyicisini oluşturdum.

**BackPanel**: Kenarlıksız özel bir panel oluşturtmak için normal bir panelden kalıtım aldığım ve paint metodunu Override ederek şeklini değiştirdim.

**TopPanel**: Kenarlıksız pencere için üstte hareket ettirebilecek bir alan oluşturma için
ek fonksiyonlar eklediğim panel.

**Chart**: Normal bir paneli kalıtıma alarak paint metodunu Override edip veri
tabanından gelen veriye göre grafik çizen bir panel oluşturdum.

**MenuItems**: Yönetici ekranında birden fazla Menü oluştrumak yerine bir paneli
kalıtım alıp bazı ek özellikler ekleyerek mesela basıldığında constant sınfındaki border

### 2.Diller

LangM sınıfında şablon dil taslağını oluşturup bunu kalıtım alarak settingsbölümünden ayarlanıp uygulama açıldığında otomatik olarak gösteriyor. Ekranlarda her elemanın dil özelliğini en başta dil işlemlerini gerçekleştiren bir metod ekledim.

### 3.Özelleştirilmiş Yönetici Seçenekleri

- Yönetici kendisine sunulan özel arama filtreleriyle, sıralama filtreleriyle, başta sonda veya kelimeni içinde ara seçenekleriyle istediğini rahat bir şekilde bulabilir ve yüzde seçeneğiyle gelen aramaları sınırlandırabilir.
- Ekleme yaparken regexler vasıtasıyla yanlış yazmanın önüne geçilip hata payı düşürülüyor. Ve tablodan seçtiği otomatik geldiği için güncelleme işlemlerini daha rahat bir şekilde yapabiliyor.

### 4.Ayarlar

- Kullanıcı isteğine göre temasını seçip dilini ayarlayabiliyor. İsterse de Border renklerini de değiştirebiliyor
- Bir hata oldumu yazılımcıya hata gönder bölümünden kaydedilmiş hata kayıtlarını bir belge halinde kendi yorumlarını da ekleyeyerek gönderebilir.

## Uygulamadan Bazı Görüntüler

![resim](https://user-images.githubusercontent.com/75750279/173316210-f5d298a1-0633-46d7-bb35-4705888fc97b.png)

![resim](https://user-images.githubusercontent.com/75750279/173316233-dc0a90a0-3f9f-409b-aacf-cee54aca0aff.png)

![resim](https://user-images.githubusercontent.com/75750279/173316251-a7d965d4-4029-4a84-8c9f-2281402ca907.png)

![resim](https://user-images.githubusercontent.com/75750279/173316272-12e4421f-2371-49e6-b05a-ecd7996f4d37.png)

![resim](https://user-images.githubusercontent.com/75750279/173316430-cf674ec3-449f-4b5c-a90d-e0396ebf89d5.png)

![resim](https://user-images.githubusercontent.com/75750279/173316591-d14cef93-7cca-4f57-acbe-1719322cd22b.png)

![resim](https://user-images.githubusercontent.com/75750279/173316456-66779d8c-3570-4ef4-91fe-0c845b46c33b.png)

![resim](https://user-images.githubusercontent.com/75750279/173316469-40ca9d48-ce4a-4b9d-b8f3-5839445f95f6.png)

![resim](https://user-images.githubusercontent.com/75750279/173316481-9fcbe259-a19a-4e00-b6ff-faed9ae44f07.png)

![resim](https://user-images.githubusercontent.com/75750279/173316521-7f3643a3-89e8-4035-bdc3-06fa8c4ed653.png)

