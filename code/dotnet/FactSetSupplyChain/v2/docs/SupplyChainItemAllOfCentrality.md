# FactSet.SDK.FactSetSupplyChain.Model.SupplyChainItemAllOfCentrality
Centrality metrics representing the entity's relative importance and connectivity within the supply chain network. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Degree** | **double?** | Degree centrality represents the number of direct connections with suppliers and customers. The value is normalized by the number of entities in the supply chain database at each calculation date. | [optional] 
**Eigenvector** | **double?** | Eigenvector centrality assigns higher scores to companies connected to well-connected firms. This measure is calculated in an undirected network, meaning both supplier-customer and customer-supplier relationships are considered. All scores are normalized by L2 norm at each calculation date. | [optional] 
**ProductKatz** | **double?** | Katz centrality assesses both direct and downstream connections while reducing the influence of indirect connections based on distance. PRODUCT_KATZ reflects the impact of both direct and indirect suppliers. All scores are normalized by L2 norm at each calculation date. | [optional] 
**CashKatz** | **double?** | Katz centrality assesses both direct and downstream connections while reducing the influence of indirect connections based on distance. CASH_KATZ reflects the impact of both direct and indirect customers. All scores are normalized by L2 norm at each calculation date. | [optional] 
**Customer** | **double?** | Customer centrality is derived from the HITS (Hyperlink-Induced Topic Search) algorithm, assigning higher scores to customers connected to suppliers relied upon by many other customers. All scores are normalized by L1 norm at each calculation date. | [optional] 
**Supplier** | **double?** | Supplier centrality is derived from the HITS (Hyperlink-Induced Topic Search) algorithm, assigning high scores to suppliers connected to customers with high customer centrality. All scores are normalized by L1 norm at each calculation date. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

