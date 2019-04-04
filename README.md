# HttpsApplication
Simple rest controller accessible only by using https 

To generate a truststore use the command below 

keytool -genkey -alias selfsigned -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore <Path>\mykeystore1.jks -validity 360

After a certificate is created, copy it to resources and add the cofigurations to the application.properties to enable to SSL 
