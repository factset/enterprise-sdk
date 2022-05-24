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
import VendorChartIQTimeSeriesEodListMeta from './VendorChartIQTimeSeriesEodListMeta';
import VendorChartIQTimeSeriesIntradaySubsampleListData from './VendorChartIQTimeSeriesIntradaySubsampleListData';

/**
 * The InlineObject4 model module.
 * @module model/InlineObject4
 * @version 0.10.0
 */
class InlineObject4 {
    /**
     * Constructs a new <code>InlineObject4</code>.
     * @alias module:model/InlineObject4
     * @param data {module:model/VendorChartIQTimeSeriesIntradaySubsampleListData} 
     */
    constructor(data) { 
        
        InlineObject4.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>InlineObject4</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject4} obj Optional instance to populate.
     * @return {module:model/InlineObject4} The populated <code>InlineObject4</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject4();

            if (data.hasOwnProperty('data')) {
                obj['data'] = VendorChartIQTimeSeriesIntradaySubsampleListData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = VendorChartIQTimeSeriesEodListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/VendorChartIQTimeSeriesIntradaySubsampleListData} data
 */
InlineObject4.prototype['data'] = undefined;

/**
 * @member {module:model/VendorChartIQTimeSeriesEodListMeta} meta
 */
InlineObject4.prototype['meta'] = undefined;






export default InlineObject4;
