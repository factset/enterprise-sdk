# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetOwnershipReportBuilder.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetOwnershipReportBuilder.model.error_object import ErrorObject
from fds.sdk.FactSetOwnershipReportBuilder.model.error_object_links import ErrorObjectLinks
from fds.sdk.FactSetOwnershipReportBuilder.model.error_object_source import ErrorObjectSource
from fds.sdk.FactSetOwnershipReportBuilder.model.error_response import ErrorResponse
from fds.sdk.FactSetOwnershipReportBuilder.model.error_with_meta_response import ErrorWithMetaResponse
from fds.sdk.FactSetOwnershipReportBuilder.model.meta import Meta
from fds.sdk.FactSetOwnershipReportBuilder.model.response_holders import ResponseHolders
from fds.sdk.FactSetOwnershipReportBuilder.model.response_ultimate_parent import ResponseUltimateParent
