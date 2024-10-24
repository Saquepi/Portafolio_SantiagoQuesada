
package tienda.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "techshop-85be9.appspot.com";
    
    final String rutaSuperiorStorage = "techshop";
    
    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "techshop-85be9-firebase-adminsdk-kmitm-9ebafe0275.json";
}
