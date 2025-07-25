/**
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FactSetProtobufStachV3Sort from './FactSetProtobufStachV3Sort';
import FactSetProtobufStachV3TableViewTypesAggregate from './FactSetProtobufStachV3TableViewTypesAggregate';
import FactSetProtobufStachV3TableViewTypesCollapsedColumn from './FactSetProtobufStachV3TableViewTypesCollapsedColumn';

/**
 * The FactSetProtobufStachV3TableViewTypesGroup model module.
 * @module model/FactSetProtobufStachV3TableViewTypesGroup
 */
class FactSetProtobufStachV3TableViewTypesGroup {
    /**
     * Constructs a new <code>FactSetProtobufStachV3TableViewTypesGroup</code>.
     * @alias module:model/FactSetProtobufStachV3TableViewTypesGroup
     */
    constructor() { 
        
        FactSetProtobufStachV3TableViewTypesGroup.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufStachV3TableViewTypesGroup</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufStachV3TableViewTypesGroup} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufStachV3TableViewTypesGroup} The populated <code>FactSetProtobufStachV3TableViewTypesGroup</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufStachV3TableViewTypesGroup();

            if (data.hasOwnProperty('by')) {
                obj['by'] = ApiClient.convertToType(data['by'], ['String']);
            }
            if (data.hasOwnProperty('collapsedColumn')) {
                obj['collapsedColumn'] = FactSetProtobufStachV3TableViewTypesCollapsedColumn.constructFromObject(data['collapsedColumn']);
            }
            if (data.hasOwnProperty('aggregates')) {
                obj['aggregates'] = ApiClient.convertToType(data['aggregates'], {'String': FactSetProtobufStachV3TableViewTypesAggregate});
            }
            if (data.hasOwnProperty('excludeTotalRows')) {
                obj['excludeTotalRows'] = ApiClient.convertToType(data['excludeTotalRows'], 'Boolean');
            }
            if (data.hasOwnProperty('excludeGroupRows')) {
                obj['excludeGroupRows'] = ApiClient.convertToType(data['excludeGroupRows'], ['String']);
            }
            if (data.hasOwnProperty('excludeDetailRows')) {
                obj['excludeDetailRows'] = ApiClient.convertToType(data['excludeDetailRows'], 'Boolean');
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], {'String': FactSetProtobufStachV3Sort});
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} by
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['by'] = undefined;

/**
 * @member {module:model/FactSetProtobufStachV3TableViewTypesCollapsedColumn} collapsedColumn
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['collapsedColumn'] = undefined;

/**
 * @member {Object.<String, module:model/FactSetProtobufStachV3TableViewTypesAggregate>} aggregates
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['aggregates'] = undefined;

/**
 * @member {Boolean} excludeTotalRows
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['excludeTotalRows'] = undefined;

/**
 * @member {Array.<String>} excludeGroupRows
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['excludeGroupRows'] = undefined;

/**
 * @member {Boolean} excludeDetailRows
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['excludeDetailRows'] = undefined;

/**
 * @member {Object.<String, module:model/FactSetProtobufStachV3Sort>} sort
 */
FactSetProtobufStachV3TableViewTypesGroup.prototype['sort'] = undefined;






export default FactSetProtobufStachV3TableViewTypesGroup;

