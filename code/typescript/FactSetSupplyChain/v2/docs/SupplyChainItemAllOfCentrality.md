# factsetsupplychain.SupplyChainItemAllOfCentrality

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**degree** | **Number** | Degree centrality represents the number of direct connections with suppliers and customers. The value is normalized by the number of entities in the supply chain database at each calculation date. | [optional] 
**eigenvector** | **Number** | Eigenvector centrality assigns higher scores to companies connected to well-connected firms. This measure is calculated in an undirected network, meaning both supplier-customer and customer-supplier relationships are considered. All scores are normalized by L2 norm at each calculation date. | [optional] 
**productKatz** | **Number** | Katz centrality assesses both direct and downstream connections while reducing the influence of indirect connections based on distance. PRODUCT_KATZ reflects the impact of both direct and indirect suppliers. All scores are normalized by L2 norm at each calculation date. | [optional] 
**cashKatz** | **Number** | Katz centrality assesses both direct and downstream connections while reducing the influence of indirect connections based on distance. CASH_KATZ reflects the impact of both direct and indirect customers. All scores are normalized by L2 norm at each calculation date. | [optional] 
**customer** | **Number** | Customer centrality is derived from the HITS (Hyperlink-Induced Topic Search) algorithm, assigning higher scores to customers connected to suppliers relied upon by many other customers. All scores are normalized by L1 norm at each calculation date. | [optional] 
**supplier** | **Number** | Supplier centrality is derived from the HITS (Hyperlink-Induced Topic Search) algorithm, assigning high scores to suppliers connected to customers with high customer centrality. All scores are normalized by L1 norm at each calculation date. | [optional] 


