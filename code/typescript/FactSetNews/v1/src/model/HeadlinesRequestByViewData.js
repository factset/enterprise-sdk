/**
 * News API
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import HeadlinesRequestByViewDataSearchTime from './HeadlinesRequestByViewDataSearchTime';

/**
 * The HeadlinesRequestByViewData model module.
 * @module model/HeadlinesRequestByViewData
 */
class HeadlinesRequestByViewData {
    /**
     * Constructs a new <code>HeadlinesRequestByViewData</code>.
     * @alias module:model/HeadlinesRequestByViewData
     */
    constructor() { 
        
        HeadlinesRequestByViewData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HeadlinesRequestByViewData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HeadlinesRequestByViewData} obj Optional instance to populate.
     * @return {module:model/HeadlinesRequestByViewData} The populated <code>HeadlinesRequestByViewData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HeadlinesRequestByViewData();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('predefinedRange')) {
                obj['predefinedRange'] = ApiClient.convertToType(data['predefinedRange'], 'String');
            }
            if (data.hasOwnProperty('searchTime')) {
                obj['searchTime'] = HeadlinesRequestByViewDataSearchTime.constructFromObject(data['searchTime']);
            }
        }
        return obj;
    }


}

/**
 * Name of the view to return headlines for.
 * @member {String} name
 */
HeadlinesRequestByViewData.prototype['name'] = undefined;

/**
 * See list of valid date ranges. Date range is mutually exlusive to start/end time.
 * @member {module:model/HeadlinesRequestByViewData.PredefinedRangeEnum} predefinedRange
 */
HeadlinesRequestByViewData.prototype['predefinedRange'] = undefined;

/**
 * @member {module:model/HeadlinesRequestByViewDataSearchTime} searchTime
 */
HeadlinesRequestByViewData.prototype['searchTime'] = undefined;





/**
 * Allowed values for the <code>predefinedRange</code> property.
 * @enum {String}
 * @readonly
 */
HeadlinesRequestByViewData['PredefinedRangeEnum'] = {

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



export default HeadlinesRequestByViewData;

