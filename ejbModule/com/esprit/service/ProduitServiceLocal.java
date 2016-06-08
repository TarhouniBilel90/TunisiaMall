package com.esprit.service;

import java.util.List;

 
import com.esprit.entity.Produit;

public interface ProduitServiceLocal {

	
	void createProduit(Produit product);
	void desactiverProduit (Produit product);
	void modifierProduit (Produit product);
	List <Produit> findAllProduct();
	void saveProduct (Produit product);

}