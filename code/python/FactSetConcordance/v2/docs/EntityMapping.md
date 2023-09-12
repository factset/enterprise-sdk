# EntityMapping

Concordance Company Entity Mapping object. Shows the mapping detail related to user's universe. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str, none_type** | FactSet Entity Identifier of the entity matched to the submitted entity | [optional] 
**entity_name** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**client_id** | **str, none_type** | User-defined unique identifier provided by the user in the request | [optional] 
**client_name** | **str, none_type** | Name of the entity to match as specified in the request. | [optional] 
**client_country** | **str, none_type** | ISO2 country code specified in the request | [optional] 
**client_state** | **str, none_type** | State code specified in the request | [optional] 
**client_priority** | **str, none_type** | Priority associated to the id. | [optional] 
**client_bbg_figi** | **str, none_type** | Name as provided by the user for the type Bloomberg listing/regional/security id. | [optional] 
**client_bbg_ticker** | **str, none_type** | Name as provided by the user for the type Bloomberg listing and regional ticker. | [optional] 
**client_bic** | **str, none_type** | Name as provided by the user for the type BIC - Bank Indentification Code. | [optional] 
**client_cik** | **str, none_type** | Name as provided by the user for the type CIK - Edgar Central Index Keys. | [optional] 
**client_crd** | **str, none_type** | Name as provided by the user for the type CRD - Central Registration Depository. | [optional] 
**client_cusip** | **str, none_type** | Name as provided by the user for the type CUSIP. | [optional] 
**client_duns** | **str, none_type** | Name as provided by the user for the type DUNS - Dun &amp; Bradstreet Data Universal Numbering System. | [optional] 
**client_ein** | **str, none_type** | Name as provided by the user for the type EIN - Employer Identification Number. | [optional] 
**client_factset_id** | **str, none_type** | Name as provided by the user for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier. | [optional] 
**client_fitch** | **str, none_type** | Name as provided by the user for the type Fitch - Fitch Ratings Identifier. | [optional] 
**client_gvkey** | **str, none_type** | Name as provided by the user for the type GVKEY, Compustat Global Company Key. | [optional] 
**client_gvkey_iid** | **str, none_type** | Name as provided by the user for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier. | [optional] 
**client_isin** | **str, none_type** | Name as provided by the user for the type ISIN - International Securities Identification Number. | [optional] 
**client_jcn** | **str, none_type** | Name as provided by the user for the type JCN , Japanese Corporate Number. | [optional] 
**client_lei** | **str, none_type** | Name as provided by the user for the type LEI - Legal Entity Identifier. | [optional] 
**client_lxid** | **str, none_type** | Name as provided by the user for the type LXID, Markit Syndicated Loan Identifier. | [optional] 
**client_md** | **str, none_type** | Name as provided by the user for the type Moody&#39;s ratings identifier. | [optional] 
**client_red_code** | **str, none_type** | Name as provided by the user for the type RedCode, Markit Reference Entity Identifier. | [optional] 
**client_rssd** | **str, none_type** | Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier. | [optional] 
**client_sedol** | **str, none_type** | Name as provided by the user for the type SEDOL. | [optional] 
**client_spr** | **str, none_type** | Name as provided by the user for the type S&amp;P ratings identifier. | [optional] 
**client_ticker** | **str, none_type** | Name as provided by the user for the type price ticker. | [optional] 
**client_ticker_exchange** | **str, none_type** | Name as provided by the user for the type ticker exchange. | [optional] 
**client_ticker_region** | **str, none_type** | Name as provided by the user for the type ticker region. | [optional] 
**client_ukch** | **str, none_type** | Name as provided by the user for the type UK company house identifier. | [optional] 
**client_valoren** | **str, none_type** | Name as provided by the user for the type Valoren - Valor Identification. | [optional] 
**client_wkn** | **str, none_type** | Name as provided by the user for the type WKN - German Securities Identification. | [optional] 
**client_url** | **str, none_type** | URL specified in the request | [optional] 
**created_time** | **datetime, none_type** | Time when entity was created in UTC. | [optional] 
**updated_time** | **datetime, none_type** | Time when the submitted entity was last updated in UTC. | [optional] 
**map_status** | **str, none_type** | Current status of the entity mapping. | [optional] 
**universe_id** | **int, none_type** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


