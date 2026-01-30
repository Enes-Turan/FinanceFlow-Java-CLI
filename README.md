# FinanceFlow - Kişisel Finans Takip Sistemi

FinanceFlow, kullanıcıların gelir ve giderlerini yönetmelerine, bütçe analizi yapmalarına ve finansal durumlarını anlık olarak takip etmelerine olanak tanıyan Java tabanlı bir komut satırı (CLI) uygulamasıdır.

## 🎯 Projenin Amacı
Bu proje, yazılım mühendisliği prensiplerini (SOLID, OOP) gerçek hayat senaryosuna uygulamak amacıyla geliştirilmiştir. Kullanıcıların harcamalarını kategorize ederek finansal farkındalıklarını artırmayı hedefler.

## 🚀 Özellikler
* **Gelir ve Gider Takibi:** İşlemleri türlerine göre ayırarak kayıt altına alma.
* **Anlık Bakiye Hesaplama:** Tüm gelir ve giderler üzerinden net bakiyeyi otomatik hesaplama.
* **Kategori Bazlı Analiz:** Java Stream API kullanarak harcamaların hangi kategorilerde (Kira, Market, Maaş vb.) yoğunlaştığını raporlama.
* **Modüler Mimari:** Yeni özellikler eklemeye (veritabanı, GUI vb.) uygun, genişletilebilir kod yapısı.

## 🛠️ Kullanılan Teknolojiler ve Teknikler
* **Dil:** Java 
* **OOP Prensipleri:** Abstraction (Soyutlama), Inheritance (Kalıtım) ve Polymorphism (Çok Biçimlilik).
* **Veri Yapıları:** `ArrayList`, `Map`, `Stream API`.
* **Dosya Yönetimi:** Serializable arabirimi ile nesne tabanlı yapı.

## 📂 Proje Yapısı
```text
src/
├── Main.java           # Uygulama giriş noktası ve menü yönetimi
├── FinanceManager.java # İş mantığı ve hesaplamaların yapıldığı servis katmanı
├── Transaction.java    # Temel işlem sınıfı (Abstract Base Class)
├── Income.java         # Gelir modellerini temsil eden sınıf
└── Expense.java        # Gider modellerini temsil eden sınıf
