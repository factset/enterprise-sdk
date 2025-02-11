/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import HeadlinesRequestDataSearchTime from './HeadlinesRequestDataSearchTime';
import HeadlinesRequestTickersObject from './HeadlinesRequestTickersObject';

/**
 * The HeadlinesRequestData model module.
 * @module model/HeadlinesRequestData
 */
class HeadlinesRequestData {
    /**
     * Constructs a new <code>HeadlinesRequestData</code>.
     * @alias module:model/HeadlinesRequestData
     */
    constructor() { 
        
        HeadlinesRequestData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HeadlinesRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HeadlinesRequestData} obj Optional instance to populate.
     * @return {module:model/HeadlinesRequestData} The populated <code>HeadlinesRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HeadlinesRequestData();

            if (data.hasOwnProperty('tickers')) {
                obj['tickers'] = ApiClient.convertToType(data['tickers'], [HeadlinesRequestTickersObject]);
            }
            if (data.hasOwnProperty('isPrimary')) {
                obj['isPrimary'] = ApiClient.convertToType(data['isPrimary'], 'Boolean');
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], ['String']);
            }
            if (data.hasOwnProperty('topics')) {
                obj['topics'] = ApiClient.convertToType(data['topics'], ['String']);
            }
            if (data.hasOwnProperty('regions')) {
                obj['regions'] = ApiClient.convertToType(data['regions'], ['String']);
            }
            if (data.hasOwnProperty('sectors')) {
                obj['sectors'] = ApiClient.convertToType(data['sectors'], ['String']);
            }
            if (data.hasOwnProperty('predefinedRange')) {
                obj['predefinedRange'] = ApiClient.convertToType(data['predefinedRange'], 'String');
            }
            if (data.hasOwnProperty('searchTime')) {
                obj['searchTime'] = HeadlinesRequestDataSearchTime.constructFromObject(data['searchTime']);
            }
        }
        return obj;
    }


}

/**
 * List of tickers to filter the headlines. Each ticker is an object.
 * @member {Array.<module:model/HeadlinesRequestTickersObject>} tickers
 */
HeadlinesRequestData.prototype['tickers'] = undefined;

/**
 * If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned 
 * @member {Boolean} isPrimary
 */
HeadlinesRequestData.prototype['isPrimary'] = undefined;

/**
 * A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \"Earnings\". Use the `/filters/categories` endpoint to get the list of available categories.
 * @member {Array.<String>} categories
 */
HeadlinesRequestData.prototype['categories'] = undefined;

/**
 * A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \"Market Summaries\". Use the `/filters/topics` endpoint to get the list of available topics.
 * @member {Array.<String>} topics
 */
HeadlinesRequestData.prototype['topics'] = undefined;

/**
 * A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \"North America\". Use the `/filters/regions` endpoint to get the list of available regions.
 * @member {Array.<String>} regions
 */
HeadlinesRequestData.prototype['regions'] = undefined;

/**
 * A list of sectors used to filter the headlines. Sectors are segments or divisions of the economy or market provided by StreetAccount, such as \"Financial\". Use the `/filters/sectors`endpoint to get the list of available sectors.
 * @member {Array.<String>} sectors
 */
HeadlinesRequestData.prototype['sectors'] = undefined;

/**
 * see list of valid date ranges. Date range is mutually exclusive to start/end time
 * @member {module:model/HeadlinesRequestData.PredefinedRangeEnum} predefinedRange
 */
HeadlinesRequestData.prototype['predefinedRange'] = undefined;

/**
 * @member {module:model/HeadlinesRequestDataSearchTime} searchTime
 */
HeadlinesRequestData.prototype['searchTime'] = undefined;





/**
 * Allowed values for the <code>predefinedRange</code> property.
 * @enum {String}
 * @readonly
 */
HeadlinesRequestData['PredefinedRangeEnum'] = {

    /**
     * value: "today"
     * @const
     */
    "today": "today",

    /**
     * value: "twoDays"
     * @const
     */
    "twoDays": "twoDays",

    /**
     * value: "oneWeek"
     * @const
     */
    "oneWeek": "oneWeek",

    /**
     * value: "oneMonth"
     * @const
     */
    "oneMonth": "oneMonth",

    /**
     * value: "threeMonths"
     * @const
     */
    "threeMonths": "threeMonths",

    /**
     * value: "sixMonths"
     * @const
     */
    "sixMonths": "sixMonths",

    /**
     * value: "oneYear"
     * @const
     */
    "oneYear": "oneYear",

    /**
     * value: "threeYears"
     * @const
     */
    "threeYears": "threeYears",

    /**
     * value: "fiveYears"
     * @const
     */
    "fiveYears": "fiveYears",

    /**
     * value: "tenYears"
     * @const
     */
    "tenYears": "tenYears",

    /**
     * value: "allAvailable"
     * @const
     */
    "allAvailable": "allAvailable"
};



export default HeadlinesRequestData;

