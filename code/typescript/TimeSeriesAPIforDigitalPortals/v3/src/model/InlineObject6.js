/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PricesTimeSeriesEodSubsampleGetData from './PricesTimeSeriesEodSubsampleGetData';
import VendorChartIQTimeSeriesEodSubsampleGetMeta from './VendorChartIQTimeSeriesEodSubsampleGetMeta';

/**
 * The InlineObject6 model module.
 * @module model/InlineObject6
 */
class InlineObject6 {
    /**
     * Constructs a new <code>InlineObject6</code>.
     * @alias module:model/InlineObject6
     */
    constructor() { 
        
        InlineObject6.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject6</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject6} obj Optional instance to populate.
     * @return {module:model/InlineObject6} The populated <code>InlineObject6</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject6();

            if (data.hasOwnProperty('data')) {
                obj['data'] = PricesTimeSeriesEodSubsampleGetData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = VendorChartIQTimeSeriesEodSubsampleGetMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PricesTimeSeriesEodSubsampleGetData} data
 */
InlineObject6.prototype['data'] = undefined;

/**
 * @member {module:model/VendorChartIQTimeSeriesEodSubsampleGetMeta} meta
 */
InlineObject6.prototype['meta'] = undefined;






export default InlineObject6;

