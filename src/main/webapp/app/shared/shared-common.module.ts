import { NgModule } from '@angular/core';

import { MomolithicApplicationSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [MomolithicApplicationSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [MomolithicApplicationSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class MomolithicApplicationSharedCommonModule {}
