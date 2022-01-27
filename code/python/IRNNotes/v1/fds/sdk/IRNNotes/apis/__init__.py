
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.attachments_api import AttachmentsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.IRNNotes.api.attachments_api import AttachmentsApi
from fds.sdk.IRNNotes.api.comments_api import CommentsApi
from fds.sdk.IRNNotes.api.events_api import EventsApi
from fds.sdk.IRNNotes.api.identifiers_api import IdentifiersApi
from fds.sdk.IRNNotes.api.notes_api import NotesApi
