/**
 * Real-Time News API
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency from './GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency';

/**
 * The GetBasicValueUnitCurrencyFractionalListDataItems model module.
 * @module model/GetBasicValueUnitCurrencyFractionalListDataItems
 */
class GetBasicValueUnitCurrencyFractionalListDataItems {
    /**
     * Constructs a new <code>GetBasicValueUnitCurrencyFractionalListDataItems</code>.
     * A list of objects. For semantical context see the description of the parent array.
     * @alias module:model/GetBasicValueUnitCurrencyFractionalListDataItems
     */
    constructor() { 
        
        GetBasicValueUnitCurrencyFractionalListDataItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetBasicValueUnitCurrencyFractionalListDataItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetBasicValueUnitCurrencyFractionalListDataItems} obj Optional instance to populate.
     * @return {module:model/GetBasicValueUnitCurrencyFractionalListDataItems} The populated <code>GetBasicValueUnitCurrencyFractionalListDataItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetBasicValueUnitCurrencyFractionalListDataItems();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('factor')) {
                obj['factor'] = ApiClient.convertToType(data['factor'], 'Number');
            }
            if (data.hasOwnProperty('mainCurrency')) {
                obj['mainCurrency'] = GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency.constructFromObject(data['mainCurrency']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the fractional currency, which is a value unit.
 * @member {Number} id
 */
GetBasicValueUnitCurrencyFractionalListDataItems.prototype['id'] = undefined;

/**
 * Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent).
 * @member {String} code
 */
GetBasicValueUnitCurrencyFractionalListDataItems.prototype['code'] = undefined;

/**
 * Name of the fractional currency.
 * @member {String} name
 */
GetBasicValueUnitCurrencyFractionalListDataItems.prototype['name'] = undefined;

/**
 * Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar.
 * @member {Number} factor
 */
GetBasicValueUnitCurrencyFractionalListDataItems.prototype['factor'] = undefined;

/**
 * @member {module:model/GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency} mainCurrency
 */
GetBasicValueUnitCurrencyFractionalListDataItems.prototype['mainCurrency'] = undefined;






export default GetBasicValueUnitCurrencyFractionalListDataItems;

