/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SegmentValue model module.
 * @module model/SegmentValue
 */
class SegmentValue {
    /**
     * Constructs a new <code>SegmentValue</code>.
     * Value of the data metric requested. Note that the type of value is &#39;object&#39;, and depending on the data metric requested, the value could be an object representation of a string or double. 
     * @alias module:model/SegmentValue
     */
    constructor() { 
        
        SegmentValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SegmentValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SegmentValue} obj Optional instance to populate.
     * @return {module:model/SegmentValue} The populated <code>SegmentValue</code> instance.
     */
    static constructFromObject(data, obj) {
        // openApiType:number format:double
        if (typeof data === 'number') return ApiClient.setValue(obj || new SegmentValue(), data);
        if (typeof data === 'string') return ApiClient.setValue(obj || new SegmentValue(), data);
    }


}






export default SegmentValue;

